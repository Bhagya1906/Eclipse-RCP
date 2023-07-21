package employeetable;

import java.text.MessageFormat;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

//package employeetable;
//
//
//import org.eclipse.jface.dialogs.Dialog;
//import org.eclipse.jface.dialogs.IDialogConstants;
//import org.eclipse.jface.viewers.ArrayContentProvider;
//import org.eclipse.jface.viewers.ComboViewer;
//import org.eclipse.jface.viewers.LabelProvider;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.graphics.Point;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.widgets.Combo;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Control;
//import org.eclipse.swt.widgets.Label;
//import org.eclipse.swt.widgets.Shell;
//
//public class DialogBoxCellEditor extends Dialog {
//	private ComboViewer comboViewer;
//    private String selectedCity;
//    private String dialogTitle;
//    private String dialogMessage;
//    
//     // Add constructor to accept title and label as parameters
//    public DialogBoxCellEditor(Shell parentShell, String dialogTitle, String dialogMessage) {
//    	super(parentShell);
//    	this.dialogTitle = dialogTitle;
//    	this.dialogMessage = dialogMessage;
//        
//    }
//
//    @Override
//    protected Control createDialogArea(Composite parent) {
//        Composite container = (Composite) super.createDialogArea(parent);
//        container.setLayout(new GridLayout(1, false));
//        parent.getShell().setText(dialogTitle);
//
//        Label label = new Label(container, SWT.WRAP);
//        label.setText(dialogMessage);
//
//        ComboViewer cityComboViewer = new ComboViewer(container, SWT.READ_ONLY);
//        Combo cityCombo = cityComboViewer.getCombo();
//        cityCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
//        cityComboViewer.setContentProvider(ArrayContentProvider.getInstance());
//        cityComboViewer.setLabelProvider(new LabelProvider());
//                
//        String[] cities = new String[]{"Ahmedabad", "Bangalore", "Chennai","Coimbatore","Delhi","Kochi","Kolkatta","Mumbi","Nagpur","Pune"};
//        cityComboViewer.setInput(cities);
//        cityComboViewer.addSelectionChangedListener(event -> {
//            selectedCity = cityComboViewer.getStructuredSelection().getFirstElement().toString();
//        });
//
//        return container;
//    }
//
//    @Override
//    protected void createButtonsForButtonBar(Composite parent) {
//        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
//        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
//    }
//    
//    @Override
//    protected Point getInitialSize() {
//        return new Point(500, 300); 
//    }
//
//
//    @Override
//    protected void okPressed() {
//        // Perform any validation or additional actions before closing the dialog
//        super.okPressed();
//    }
//
//    public String getSelectedCity() {
//        return selectedCity;
//    }
//}


public class DialogBoxCellEditor extends DialogCellEditor {

	public static final Object OK = null;
	private Text textField;
	private String dialogMessage;
	private String dialogTitle;

	
	public DialogBoxCellEditor(Shell shell, String title, String message) {
		// TODO Auto-generated constructor stub
	}

	public void setDialogMessage(String dialogMessage) {
		this.dialogMessage = dialogMessage;
	}

	public void setDialogTitle(String dialogTitle) {
		this.dialogTitle = dialogTitle;
	}

	@Override
	protected Control createContents(Composite cell) {
		textField = new Text(cell, SWT.NONE);
		textField.setFont(cell.getFont());
		textField.setBackground(cell.getBackground());
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent event) {
				setValueToModel();
			}
		});

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent event) {
				keyReleaseOccured(event);
			}
		});

		return textField;
	}

	@Override
	protected void keyReleaseOccured(KeyEvent keyEvent) {
		if (keyEvent.keyCode == SWT.CR || keyEvent.keyCode == SWT.KEYPAD_CR) {
			// Enter key
			setValueToModel();
		}
		super.keyReleaseOccured(keyEvent);
	}

	protected void setValueToModel() {
		String newValue = textField.getText();
		boolean newValidState = isCorrect(newValue);
		if (newValidState) {
			markDirty();
			doSetValue(newValue);
		} else {
			// try to insert the current value into the error message.
			setErrorMessage(MessageFormat.format(getErrorMessage(), newValue));
		}
	}

	@Override
	protected void updateContents(Object value) {
		if (textField == null) {
			return;
		}
		String text = "";
		if (value != null) {
			text = value.toString();
		}
		textField.setText(text);

	}

	@Override
	protected void doSetFocus() {
		// Overridden to set focus to the Text widget instead of the Button.
		textField.setFocus();
		textField.selectAll();
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		InputDialog dialog = new InputDialog(cellEditorWindow.getShell(),
				dialogTitle, dialogMessage, getDialogInitialValue(), null);
		return (dialog.open() == Window.OK ? dialog.getValue() : null);
	}

	protected String getDialogInitialValue() {
		Object value = getValue();
		return (value == null ? null : value.toString());
	}

	public Object open() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSelectedCity() {
		// TODO Auto-generated method stub
		return null;
	}
}
