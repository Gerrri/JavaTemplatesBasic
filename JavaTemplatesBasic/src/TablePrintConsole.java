import java.util.ArrayList;
/**
 * @author Gerrri
 */
//Singelton
public class TablePrintConsole {

    private static TablePrintConsole onlyOne;

    private TablePrintConsole() {

    }

    public static TablePrintConsole createTable() {
        if (onlyOne == null) {
            onlyOne = new TablePrintConsole();
        }
        return onlyOne;
    }
    
    public void print_String_Array_ArrayList(ArrayList<String[]> al){
        // String Array = Spalten
        // Array List<...> = Zeilen
        
        
        // längste zeile pro spalte ermitteln
        for(al.forEach(action);)
        
        
        
        
        
        
        
    } 

}
