package employeetable;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;

public class EmployeeEditingColumn extends EditingSupport {

    private int columnIndex;
    private TableViewer viewer;
    private DialogBoxCellEditor dialogBoxCellEditor ;
    String title = "Select a City";
    String message = "Please choose a city from the list below:";
	private boolean isValidEmail=true;
    
    public EmployeeEditingColumn(TableViewer viewer, int columnIndex) {
        super(viewer);
        this.viewer = viewer;
        this.columnIndex = columnIndex;
        
        if (columnIndex == 7) { // Create the CitySelectionDialog for the "City" column   
		dialogBoxCellEditor = new DialogBoxCellEditor(viewer.getControl().getShell(), title, message);
        }
       
        
    }

    @Override
    protected CellEditor getCellEditor(Object element) {
    	 if (columnIndex == 3) {
             String[] genders = new String[]{"Male", "Female"};
             return new ComboBoxCellEditor(viewer.getTable(), genders, SWT.READ_ONLY);
    	 }
           else if (columnIndex == 7) { // Create the CitySelectionDialog for the "City" column   
        	//return new DialogBoxCellEditor(viewer.getControl().getShell(), title, message); 
        	 
         }
           	
             else {
             return new TextCellEditor(viewer.getTable()); 
         }

    }
    
    private CellEditor ComboViewerDialog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    protected boolean canEdit(Object element) {
        return columnIndex != 0 && columnIndex != 1;
    }


    @Override
    protected Object getValue(Object Element) {
        Employee employee = (Employee) Element;
        switch (columnIndex) {
           
            case 2:
                return employee.getDesignation();
            case 3:
            	String gender = employee.getGender();
                String[] genders = new String[]{"Male", "Female"};
                for (int i = 0; i < genders.length; i++) {
                    if (genders[i].equals(gender)) {
                        return i;
                    }
                }
                // If the gender is not found, return the default value (0)
                return 0;
            case 4:
                return employee.getCompany();
            case 5:
                return String.valueOf(employee.getSalary());
            case 6:
                return employee.getEmail();
            case 7:
                return employee.getCity();
            default:
                return null;
        }
    }

    @Override
    protected void setValue(Object element, Object value) {
        if (element instanceof Employee) {
            Employee employee = (Employee) element;

            switch (columnIndex) {
               
                case 2:
                    employee.setDesignation(String.valueOf(value));
                    break;
                case 3:
                	 int selectedIndex = (int) value;
                     String[] genders = new String[]{"Male", "Female"};
                     employee.setGender(genders[selectedIndex]);
                     break;
                case 4:
                    employee.setCompany(String.valueOf(value));
                    break;
                case 5:
                    employee.setSalary(Double.parseDouble(String.valueOf(value)));
                    break;
                
                case 6:

                    String email = value.toString();

                    if (email.endsWith("@gmail.com") && isValidEmail(email)) {
                        employee.setEmail(email);

                    } else {
                   
                        System.out.println("Invalid email address: " + email);
                        employee.setEmail(email);
                    	MyLabelProvider  labelProvider = new MyLabelProvider (6);
                    	System.out.println(element);
                    	labelProvider.getBackground(element);
                        isValidEmail = false;
                     }

                    break;
                	
                case 7:                	
                	if (dialogBoxCellEditor.open() == dialogBoxCellEditor.OK) {
                        String selectedCity = dialogBoxCellEditor.getSelectedCity();
                        employee.setCity(selectedCity);
                        viewer.update(element, null);
                    }
                    break;
                    
            }
            viewer.update(element, null);
        }
    }
    
    private boolean isValidEmail(String email) {

        // A simple email format validation using regex

    	boolean a=true;
		for(int i=0;i<email.length();i++)
		{
			char c = email.charAt(i);
			if(Character.isUpperCase(c))
			{
				return a=false;
			}
			return a=true;
		}
		
		return a;

    }
}
