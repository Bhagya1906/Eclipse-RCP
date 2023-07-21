package task_1;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {

	public View() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		
		    TabFolder tab = new TabFolder(parent,SWT.BORDER);
			TabItem item1 = new TabItem(tab,SWT.NONE);
			item1.setText("Tab 1");
			Composite tabComposite1 = new Composite(tab,SWT.NONE);
			item1.setControl(tabComposite1);
		    tabComposite1.setLayout(new FillLayout());
			
			TableViewer viewer = new TableViewer(tabComposite1, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
			Table table = viewer.getTable();
			table.setHeaderVisible(true);
			table.setLinesVisible(false);
			
			TableViewerColumn column1 = new TableViewerColumn(viewer,SWT.BORDER);
			TableColumn col1 = column1.getColumn();
			col1.setText("EMP_ID");
			col1.setWidth(200);
			
			
			TableViewerColumn column2 = new TableViewerColumn(viewer,SWT.BORDER);
			TableColumn col2 = column2.getColumn();
			col2.setText("NAME");
			col2.setWidth(200);
			
			TableViewerColumn column3 = new TableViewerColumn(viewer,SWT.BORDER);
			TableColumn col3 = column3.getColumn();
			col3.setText("DESIGNATION");
			col3.setWidth(200);
			
			TableViewerColumn column4 = new TableViewerColumn(viewer,SWT.BORDER);
			TableColumn col4 = column4.getColumn();
			col4.setText("GENDER");
			col4.setWidth(200);
			
			TableViewerColumn column5 = new TableViewerColumn(viewer,SWT.BORDER);
			TableColumn col5 = column5.getColumn();
			col5.setText("COMPANY");
			col5.setWidth(200);
			
			TableViewerColumn column6 = new TableViewerColumn(viewer,SWT.BORDER);
			TableColumn col6 = column6.getColumn();
			col6.setText("SALARY");
			col6.setWidth(200);
			
			TableViewerColumn column7 = new TableViewerColumn(viewer,SWT.BORDER);
			TableColumn col7 = column7.getColumn();
			col7.setText("EMAIL");
			col7.setWidth(200);
			

			TableViewerColumn column8 = new TableViewerColumn(viewer,SWT.BORDER);
			TableColumn col8 = column8.getColumn();
			col8.setText("CITY");
			col8.setWidth(200);
			
			viewer.setContentProvider(ArrayContentProvider.getInstance());
			
			
			column1.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[0]);
		    		}
		    	}
		    });
			
			column2.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	
		    
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		
		    		
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[1]);
		    		}
		    	}
		    });
			
			column3.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	
		    	
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[2]);
		    		}
		    	}
		    });
			
			column4.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();    		
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[3]);
		    		}
		    	}
		    });
			
			column5.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();	    		
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[4]);
		    		}
		    	}
		    });
			
			column6.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		   	    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[5]);
		    		}
		    	}
		    });
			
			
			column7.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[6]);
		    		}
		    	}
		    });
			
			column8.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[7]);
		    		}
		    	}
		    });
			
			String[] row1 = {"23mb19","Bhagya","Engineer Trainee","Female","MBRDI","30000","bhagya@gmail.com","Hyderabad"};
			
			String[] row2 = {"23azn19","Atharsh","Software Engineer","Male","Amazon","30000","atharsh@gmail.com","Bangalore"};
						
			
						
			viewer.setInput(new String[][] {row1,row2});
			
			column3.setEditingSupport(new EditingSupport(viewer) {
		    	@Override
		    	protected boolean canEdit(Object element) {
		    		return true;
		    	}

		    	@Override
		    	protected CellEditor getCellEditor(Object element) {
		    		return new TextCellEditor(viewer.getTable());
		    	}

		    	@Override
		    	protected Object getValue(Object element) {
		    		if (element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			return row[2];
		    		}
		    		return null;
		    	}

		    	@Override
		    	protected void setValue(Object element, Object value) {
		    		if (element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			row[2] = value.toString();
		    			viewer.update(element, null);
		    		}
		    	}
		    });   
			
			// Create a ComboBoxViewerCellEditor with the gender values
			String[] genderValues = {"Male", "Female", "Other"};
		    ComboBoxViewerCellEditor comboViewerEditor = new ComboBoxViewerCellEditor(table, SWT.READ_ONLY);
		    comboViewerEditor.setContentProvider(new ArrayContentProvider());
		    comboViewerEditor.setLabelProvider(new LabelProvider());
		    comboViewerEditor.setInput(genderValues);
		  
			column4.setEditingSupport(new EditingSupport(viewer) {
		    	@Override
		    	protected boolean canEdit(Object element) {
		    		return true;
		    	}

		    	@Override
		    	protected CellEditor getCellEditor(Object element) {		    		
		    		return comboViewerEditor;
		    	}

		    	@Override
		    	protected Object getValue(Object element) {
		    		if (element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			return row[3];
		    		}
		    		return null;
		    	}

		    	@Override
		    	protected void setValue(Object element, Object value) {
		    		if (element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			row[3] = value.toString();
		    			viewer.update(element, null);
		    		}
		    	}
		    });   
		  
			column5.setEditingSupport(new EditingSupport(viewer) {
		    	@Override
		    	protected boolean canEdit(Object element) {
		    		return true;
		    	}

		    	@Override
		    	protected CellEditor getCellEditor(Object element) {
		    		return new TextCellEditor(viewer.getTable());
		    	}

		    	@Override
		    	protected Object getValue(Object element) {
		    		if (element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			return row[4];
		    		}
		    		return null;
		    	}

		    	@Override
		    	protected void setValue(Object element, Object value) {
		    		if (element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			row[4] = value.toString();
		    			viewer.update(element, null);
		    		}
		    	}
		    });   
		  
			column6.setEditingSupport(new EditingSupport(viewer) {
		    	@Override
		    	protected boolean canEdit(Object element) {
		    		return true;
		    	}

		    	@Override
		    	protected CellEditor getCellEditor(Object element) {
		    		return new TextCellEditor(viewer.getTable());
		    	}

		    	@Override
		    	protected Object getValue(Object element) {
		    		if (element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			return row[5];
		    		}
		    		return null;
		    	}

		    	@Override
		    	protected void setValue(Object element, Object value) {
		    		if (element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			row[5] = value.toString();
		    			viewer.update(element, null);
		    		}
		    	}
		    });   
		  
			column7.setEditingSupport(new EditingSupport(viewer) {
		    	@Override
		    	protected boolean canEdit(Object element) {
		    		return true;
		    	}

		    	@Override
		    	protected CellEditor getCellEditor(Object element) {
		    		return new TextCellEditor(viewer.getTable());
		    	}

		    	@Override
		    	protected Object getValue(Object element) {
		    		if (element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			return row[6];
		    		}
		    		return null;
		    	}

		    	@Override
		    	protected void setValue(Object element, Object value) {
		    	    if (element instanceof String[]) {
		    	        String[] row = (String[]) element;
		    	        String oldValue = row[6];
		    	        String newValue = value.toString();

		    	        if (!newValue.equals(oldValue)) {
		    	            // Open an Input Dialog to get the new value from the user
		    	            CustomInputDialog dialog = new CustomInputDialog(Display.getCurrent().getActiveShell(),
		    	                    "Edit Email Value", "Enter new value:", oldValue);
		    	            if (dialog.open() == InputDialog.OK) {
		    	                String result = dialog.getValue();
		    	                
		    	                System.out.println(result);
		    	                
		    	                boolean a = (result.endsWith("@gmail.com") && isValidGmail(result));
		    	                System.out.println(a);
		    	                
		    	                if ( result.endsWith("@gmail.com") && isValidGmail(result)) {
		    	                    row[6] = result;
		    	                    // Update the table viewer to reflect the changes
		    	                    viewer.update(element, null);
		    	                } else {
		    	                	row[6] = result;
		    	                    viewer.update(element, null);
		    	                    System.out.println("Change the font color and cell color");
		    	                    //column7.setLabelProvider(new CustomColumnLabelProvider());
		    	                    
		    	                    
		    	                }
		    	            }
		    	        }
		    	    }
		    	}
		    	
				private boolean isValidGmail(String result) {
					
					boolean a=true;
					for(int i=0;i<result.length();i++)
					{
						char c = result.charAt(i);
						if(Character.isUpperCase(c))
						{
							return a=false;
						}
						return a=true;
					}
					
					return a;
					 
				}
		    });   
		  
			column8.setEditingSupport(new EditingSupport(viewer) {
		    	@Override
		    	protected boolean canEdit(Object element) {
		    		return true;
		    	}

		    	@Override
		    	protected CellEditor getCellEditor(Object element) {
		    		return new TextCellEditor(viewer.getTable());
		    	}

		    	@Override
		    	protected Object getValue(Object element) {
		    		if (element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			return row[7];
		    		}
		    		return null;
		    	}

		    	@Override
		    	protected void setValue(Object element, Object value) {
		    		 if (element instanceof String[]) {
			    	        String[] row = (String[]) element;
			    	        String oldValue = row[6];
			    	        String newValue = value.toString();

			    	        if (!newValue.equals(oldValue)) {
			    	        	
			    	        	String dialogTitle = "City Selection";
			    	            String dialogMessage = "Please select a city from the list:";
			    	        	
			    	            ComboViewerDialog dialog = new ComboViewerDialog(Display.getDefault().getActiveShell(), dialogTitle, dialogMessage);
			    	            if (dialog.open() == InputDialog.OK) {
			    	                String selectedCity = dialog.getSelectedCity();
			    	                row[7] = selectedCity;
		    	                    viewer.update(element, null);
			    	            }
			    	        }
		    		}
		    	}
		    });   
			
			
			
			   //create a remove menu to delete the row
			
			    MenuManager menuManager = new TableViewerContextMenu(viewer);
		        Menu menu = menuManager.createContextMenu(viewer.getControl());
		        viewer.getControl().setMenu(menu);
		  
   
			TabItem item2 = new TabItem(tab,SWT.NONE);
			item2.setText("Tab 2");	
			Composite tabComposite2 = new Composite(tab,SWT.NONE);			
			item2.setControl(tabComposite2);
			tabComposite2.setLayout(new FillLayout());
			
			TableViewer viewer1 = new TableViewer(tabComposite2, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
			Table table1 = viewer1.getTable();
			table1.setHeaderVisible(true);
			table1.setLinesVisible(false);
			
			TableViewerColumn colu1 = new TableViewerColumn(viewer1,SWT.BORDER);
			TableColumn c1 = colu1.getColumn();
			c1.setText("EMP_ID");
			c1.setWidth(200);
			
			
			TableViewerColumn colu2 = new TableViewerColumn(viewer1,SWT.BORDER);
			TableColumn c2 = colu2.getColumn();
			col2.setText("NAME");
			col2.setWidth(200);
			
			TableViewerColumn colu3 = new TableViewerColumn(viewer1,SWT.BORDER);
			TableColumn c3 = colu3.getColumn();
			c3.setText("DESIGNATION");
			c3.setWidth(200);
			
			TableViewerColumn colu4 = new TableViewerColumn(viewer1,SWT.BORDER);
			TableColumn c4 = colu4.getColumn();
			c4.setText("GENDER");
			c4.setWidth(200);
			
			TableViewerColumn colu5 = new TableViewerColumn(viewer1,SWT.BORDER);
			TableColumn c5 = colu5.getColumn();
			c5.setText("COMPANY");
			c5.setWidth(200);
			
			TableViewerColumn colu6 = new TableViewerColumn(viewer1,SWT.BORDER);
			TableColumn c6 = colu6.getColumn();
			c6.setText("SALARY");
			c6.setWidth(200);
			
			TableViewerColumn colu7 = new TableViewerColumn(viewer1,SWT.BORDER);
			TableColumn c7 = colu7.getColumn();
			c7.setText("EMAIL");
			c7.setWidth(200);
			

			TableViewerColumn colu8 = new TableViewerColumn(viewer1,SWT.BORDER);
			TableColumn c8 = colu8.getColumn();
			c8.setText("CITY");
			c8.setWidth(200);
			
			viewer1.setContentProvider(ArrayContentProvider.getInstance());
			
			
			colu1.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[0]);
		    		}
		    	}
		    });
			
			colu2.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	
		    
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		
		    		
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[1]);
		    		}
		    	}
		    });
			
			colu3.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	
		    	
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[2]);
		    		}
		    	}
		    });
			
			colu4.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();    		
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[3]);
		    		}
		    	}
		    });
			
			colu5.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();	    		
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[4]);
		    		}
		    	}
		    });
			
			colu6.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		   	    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[5]);
		    		}
		    	}
		    });
			
			
			colu7.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[6]);
		    		}
		    	}
		    });
			
			colu8.setLabelProvider(new CellLabelProvider()
		    {
		    	@Override
		    	public void update(ViewerCell cell) {
		    		Object element = cell.getElement();
		    		if(element instanceof String[]) {
		    			String[] row = (String[]) element;
		    			cell.setText(row[7]);
		    		}
		    	}
		    });
			
			viewer1.setInput(new String[][] {row1,row2});
			
			//Adding a action bar into view
			
			 Action buttonAction = new Action("SAVE", SWT.PUSH) {
		            @Override
		            public void run() {
		                // Define the behavior of the button here
		                System.out.println("Button clicked!");
		            }
		        };
		        
		        // Get the toolbar manager from the action bars
		        IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();

		        // Add the action to the toolbar
		        toolBarManager.add(buttonAction);

		        // Update the action bars
		        getViewSite().getActionBars().updateActionBars();
			
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
