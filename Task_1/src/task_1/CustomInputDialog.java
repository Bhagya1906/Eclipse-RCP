package task_1;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Shell;

public class CustomInputDialog extends InputDialog {

    public CustomInputDialog(Shell parentShell, String dialogTitle, String dialogMessage, String initialValue) {
        super(parentShell, dialogTitle, dialogMessage, initialValue, null);
    }
}
