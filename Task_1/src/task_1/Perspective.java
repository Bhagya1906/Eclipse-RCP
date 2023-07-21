package task_1;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	@Override	
	public void createInitialLayout(IPageLayout layout) {
		
		String editorarea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		IFolderLayout folder = layout.createFolder("task_1.View", IPageLayout.LEFT, (float)1.0, editorarea);
		folder.addView("task_1.View");
	}
}
