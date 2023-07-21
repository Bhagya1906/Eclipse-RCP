package task_1;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class ComboViewerDialog extends Dialog {
	private ComboViewer comboViewer;
    private String selectedCity;
    private String dialogTitle;
    private String dialogMessage;
    
  

    // Add constructor to accept title and label as parameters
    public ComboViewerDialog(Shell parentShell, String dialogTitle, String dialogMessage) {
    	super(parentShell);
    	this.dialogTitle = dialogTitle;
    	this.dialogMessage = dialogMessage ;
        
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        container.setLayout(new GridLayout(1, false));
        parent.getShell().setText(dialogTitle);

        Label label = new Label(container, SWT.WRAP);
        label.setText(dialogMessage);

        ComboViewer cityComboViewer = new ComboViewer(container, SWT.READ_ONLY);
        Combo cityCombo = cityComboViewer.getCombo();
        cityCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        cityComboViewer.setContentProvider(ArrayContentProvider.getInstance());
        cityComboViewer.setLabelProvider(new LabelProvider());
        
        
        String[] cities = new String[]{"Ahmedabad", "Bangalore", "Chennai","Coimbatore","Delhi","Kochi","Kolkatta","Mumbi","Nagpur","Pune"};
        cityComboViewer.setInput(cities);
        cityComboViewer.addSelectionChangedListener(event -> {
            selectedCity = cityComboViewer.getStructuredSelection().getFirstElement().toString();
        });

        return container;
    }

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }
    
    @Override
    protected Point getInitialSize() {
        return new Point(500, 300); 
    }


    @Override
    protected void okPressed() {
        // Perform any validation or additional actions before closing the dialog
        super.okPressed();
    }

    public String getSelectedCity() {
        return selectedCity;
    }
}


    
    




