import java.awt.*;

public class GUI {
    static Cells[][] cells = new Cells[8][8];

    /**
     * Sets the color of the cells that is available to move to. references the
     * cells array, to change the colors of the cells.
     * @param moveSets   the move set to be checked
     * @param chosenCell the cell that was clicked
     */
    public static void setColAvailCells(int[][] moveSets, Cells chosenCell) {
        for (int i = 0; i < moveSets.length; i++) {
            int x = chosenCell.posX + moveSets[i][0];
            int y = chosenCell.posY + moveSets[i][1];
            if (x >= 0 && x < 8 && y >= 0 && y < 8) {
                cells[x][y].setBackground(Color.GREEN);
            }
        }
    }
}
