package employeetable;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class MyLabelProvider extends ColumnLabelProvider {
    private int columnIndex;

    public MyLabelProvider(int columnIndex) {
        this.columnIndex = columnIndex;
    }
    
    

    @Override
    public Color getBackground(Object element) {
    	 
    	Employee employee = (Employee) element;

        String i =employee.getEmail();
    	
    	Color c= new Color(255, 0, 0);

        if(columnIndex ==6) {
//
//            if(i==) {

                return c;

//            }

        }

        return null;
   
      //return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
    }
}

