package task_1;

import org.eclipse.jface.action.MenuManager;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.TableItem;

public class TableViewerContextMenu extends MenuManager {
    private TableViewer viewer;

    public TableViewerContextMenu(TableViewer viewer) {
        super("#PopupMenu");
        this.viewer = viewer;
        setRemoveAction();
    }

    private void setRemoveAction() {
        Action removeAction = new Action("Remove") {
            public void run() {
                TableItem[] selection = viewer.getTable().getSelection();
                if (selection != null && selection.length > 0) {
                    for (TableItem item : selection) {
                        // Delete the entire row associated with the selected item
                        viewer.remove(item.getData());
                    }
                }
            }
        };
        add(removeAction);
    }
}
