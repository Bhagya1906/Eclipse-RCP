package task_1;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class CustomColumnLabelProvider extends ColumnLabelProvider {
    @Override
    public String getText(Object element) {
        // Return the text to be displayed for the column
        return "Invalid email";
    }

    @Override
    public Color getForeground(Object element) {
        // Implement the logic to determine the font color for the column
        // Here, we'll set the font color to red for demonstration purposes
        return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
    }
}
