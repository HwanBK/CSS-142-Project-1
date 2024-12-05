
/**
 * Creates a report of the first twenty elements from the periodic table.
 * @CSC 142 - Project 1
 * @Hwansu Kim (Billy)
 * @01/07/22
 */
public class ElementReport {
    
    public static void main(String[] args) {
        System.out.print('\u000c');
        
        System.out.print("   #\t");
        System.out.print("Sym   \t");
        System.out.print("Name          \t");
        System.out.print("Abundance");
        System.out.println();
        
        System.out.print(" ---\t");
        System.out.print("---   \t");
        System.out.print("---------------\t");
        System.out.print("-------------------------");
        System.out.println();
        
        printElement(" 1", "H",  "Hydrogen",   10);
        printElement(" 2", "He", "Helium",     72);
        printElement(" 3", "Li", "Lithium",    33);
        printElement(" 4", "Be", "Beryllium",  48);
        
        printElement(" 5", "B",  "Boron",      37);
        printElement(" 6", "C",  "Carbon",     17);
        printElement(" 7", "N",  "Nitrogen",   30);
        printElement(" 8", "O",  "Oxygen",      1);
        
        printElement(" 9", "F",  "Fluorine",   13);
        printElement("10", "Ne", "Neon",       73);
        printElement("11", "Na", "Sodium",      6);
        printElement("12", "Mg", "Magnesium",   7);
        
        printElement("13", "Al", "Aluminum",    3);
        printElement("14", "Si", "Silicon",     2);
        printElement("15", "P",  "Phosphorus", 11);
        printElement("16", "S",  "Sulfur",     16);
        
        printElement("17", "Cl", "Chlorine",   19);
        printElement("18", "Ar", "Argon",      44);
        printElement("19", "K",  "Potassium",   8);
        printElement("20", "Ca", "Calcium",     5);
    }
    
    // Assembles a single row of element data.
    public static void printElement(String atomNum, String eleSym, String eleName, int abunRank) {
        printNumber(atomNum); 
        printSymbol(eleSym);
        printName(eleName);
        printAbundanceHistogram(abunRank);
        System.out.println();
    }
    
    // Displays the atomic number.
    public static void printNumber(String atomicNumber) {
        int charCount = atomicNumber.length();
        for (int num = charCount; num <= 3; num++) {
            atomicNumber = " " + atomicNumber;
        }
        
        System.out.print(atomicNumber + "\t");
    }
    
    // Displays the element symbol.
    public static void printSymbol(String elementSymbol) {
        int charCount = elementSymbol.length();
        for (int num = charCount; num <= 3; num++) {
            elementSymbol = elementSymbol + " ";
        }
        
        System.out.print(elementSymbol + "\t");
    }
    
    // Displays the element's name.
    public static void printName(String elementName) {
        int charCount = elementName.length();
        for (int num = charCount; num <= 15; num++) {
            elementName = elementName + " ";
        }
        
        System.out.print(elementName);
    }
    
    // Calculates and converts abundance rank into a histogram.
    public static void printAbundanceHistogram(int atomicWeight) {
        int abundanceRank = (101 - atomicWeight) / 4;
        
        String abundanceHist = "";
        for (int num = 1; num <= abundanceRank; num++) {
            abundanceHist = abundanceHist + "*";
        }
        
        System.out.print(abundanceHist);
    }
}
