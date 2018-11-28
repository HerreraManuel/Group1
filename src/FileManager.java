
public class FileManager {

    String [][] currentString = new String[0][0];
    boolean [] displaySettings = new boolean[0];
    String rowLabel = new String();
    String fileDisplay = new String();
    String totals = new String();

    public FileManager(String [][] input, boolean [] displaySetting){
        currentString = input;
        displaySettings = displaySetting;
        setRowLabels();

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
