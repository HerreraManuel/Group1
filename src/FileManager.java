import java.lang.reflect.Array;

public class FileManager {

    String [][] currentString = new String[0][0];
    boolean [] displaySettings = new boolean[0];
    boolean displayAll = false;
    String rowLabel = new String();
    String fileDisplay = new String();
    String totals = new String();

    public FileManager(String [][] input, boolean [] displaySetting, boolean displayAll){
        currentString = input;
        displaySettings = displaySetting;
        this.displayAll = displayAll;
        setRowLabels();
        setFileDisplay();

    }

    private void  setRowLabels(){
        StringBuilder rowLabels = new StringBuilder("Filenames\n\n");
        int count = 0;
        boolean complete =false;
        if(displaySettings[0] == true){
            rowLabels.append("Characters\n\n");
            count++;
        }
        if(displaySettings[1]==true){
            rowLabels.append("Words\n\n");
            count++;
        }
        if(displaySettings[2] == true){
            rowLabels.append("Lines\n\n");
            count++;
        }
        if(displaySettings[3] == true){
            rowLabels.append("Source Lines\n\n");
            count++;
        }
        if(displaySettings[4] == true){
            rowLabels.append("Comment Lines\n");
            if(count < 5 ){
                rowLabels.append("\n");
            }
            count++;
        }
        if(count < 5){
            complete =true;
        }
        for(;count <4; count++){
            rowLabels.append("\n\n");
        }
        if(complete){
            rowLabels.append("\n");
        }
        rowLabel = String.valueOf(rowLabels);
    }

    private void setFileDisplay(){
        String[][] currentInformation = new String[5][5];
        int[] columnWidth = getColumnWidth(currentInformation);
        StringBuilder fileBuilder = new StringBuilder();
        StringBuilder totalBuilder = new StringBuilder("Totals\n\n");
        boolean complete = false;
        int count = 0;
        for (int i = 0; i < 6; i++) {
            int currentNum = 0;
            Array[][] input = new Array[10][10];
            int numFiles = 0;
            for (int j = 0; j < displaySettings.length; j++) {
                if (i > 0 && displaySettings[i - 1] == true) {
                    String output = String.format("%" + columnWidth[j] + "s", input[i][j]);
                    fileBuilder.append(output + " ");//append to the output string
                    if (currentInformation[i + 1][j].equals("N/A")) {
                    } else {
                        currentNum += Integer.parseInt(currentInformation[i + 1][j]);
                    }
                } else if (i == 0) {
                    String output = String.format("%" + columnWidth[j] + "s", input[i][j]);
                    fileBuilder.append(output + " ");//append to the output string
                }

            }
            if (i > 0 && i < 5 && (displaySettings[i - 1] == true || displayAll)) {
                totalBuilder.append(currentNum + "\n\n");
                count++;
            } else if (i == 5 && (displaySettings[i - 1] == true || displayAll)) {
                totalBuilder.append(currentNum + "\n");
                if (count < 5) {
                    totalBuilder.append("\n");
                }
                count++;
            }
        }
        for (; count < 4; count++) {
            totalBuilder.append("\n\n");
        }
        if (count < 5) {
            totalBuilder.append("\n");
        }
        fileDisplay = String.valueOf(fileBuilder);
        totals = String.valueOf(totalBuilder);
    }

    private int[] getColumnWidth(String [][] input){
            int[] columnWidth = new int[input[0].length];
            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input[0].length; j++) {
                    if (input[i][j].length() > columnWidth[j]) {
                        columnWidth[j] = input[i][j].length();
                    }
                }
            }
            return columnWidth;
    }

    public String getRowLabels(){
        return rowLabel;
    }

    public String getFileDisplay(){
        return fileDisplay;
    }

    public String getTotals(){
        return totals;
    }
}
