public class Matrix {
    private final double[][] cells;
    
    public Matrix(double[][] c){
        cells = new double[c.length][c[0].length];
        
        for (int i = 0; i < c.length; i++){
            for(int j = 0; j< c[0].length; j++){
                cells[i][j] = c[i][j];
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[0].length; j++){
                f.append(String.format("%.6f  ",cells[i][j]));
            }
            f.append("\n");
            for(int k = 0; k<=i; k++){
                f.append("    ");
            }            
        }
        
        return f.toString();
    }

    public double[][] toArray(){
        double[][] array = new double[cells.length][cells[0].length];
        for (int i = 0; i < cells.length; i++){
            for(int j = 0; j< cells[0].length; j++){
                array[i][j] = cells[i][j];
            }
        }
        return array;
    }
    
    public int getRows(){
        return cells.length;
    }

    public int getColumns(){
        return cells[0].length;
    }

    public double getAt(int row, int column){
        if (row < 0 || column < 0 || row >= cells.length || column >= cells[0].length){
            throw new IllegalArgumentException("Posicao invalida!");
        }
        return cells[row][column];
    }

    public Matrix plus(Matrix m){
        if (cells.length != m.getRows() || cells[0].length != m.getColumns()){
            throw new IllegalArgumentException("Matrizes com dimensoes incompativeis!");
        }
        double[][] sum = new double[cells.length][cells[0].length];
        for (int i = 0; i < cells.length; i++){
            for (int j = 0; j < cells[0].length; j++){
                sum[i][j] = cells[i][j] + m.getAt(i, j);                
            }
        }
        Matrix res = new Matrix(sum);
        return res;
    }

    public Matrix minus(Matrix m){
        if (cells.length != m.getRows() || cells[0].length != m.getColumns()){
            throw new IllegalArgumentException("Matrizes com dimensoes incompativeis!");
        }
        double[][] sub = new double[cells.length][cells[0].length];
        for (int i = 0; i < cells.length; i++){
            for (int j = 0; j < cells[0].length; j++){
                sub[i][j] = cells[i][j] - m.getAt(i, j);                
            }
        }
        Matrix res = new Matrix(sub);
        return res;
    }

    public Matrix times (Matrix a){
        if (cells[0].length != a.getRows()){
            throw new IllegalArgumentException("Matrizes com dimensoes incompativeis!");
        }
        double[][] mul = new double[cells.length][a.getColumns()];
        for (int i = 0; i < cells.length; i++){
            for (int j = 0; j < a.getColumns(); j++){
                for (int k = 0; k < cells[0].length; k++){
                    mul[i][j] += (cells[i][k]* a.getAt(k, j));
                }                
            }
        }
        Matrix res = new Matrix(mul);
        return res;
    }

    public Matrix times (double a){
        double[][] mul = new double[cells.length][cells[0].length];
        for (int i = 0; i < cells.length; i++){
            for (int j = 0; j < cells[0].length; j++){
                mul[i][j] = cells[i][j] * a;                
            }
        }
        Matrix res = new Matrix(mul);
        return res;
    }

    public Matrix getTranspose (){
        double[][] tr = new double[cells[0].length][cells.length];
        for (int i = 0; i < cells[0].length; i++){
            for(int j = 0; j < cells.length; j++){
                tr[i][j] = cells[j][i];
            }
        }
        Matrix res = new Matrix(tr);
        return res;
    }

    public boolean isSquare(){
        return cells.length == cells[0].length;
    }

    public boolean isSymmetric (){
        if(!isSquare()){
            return false;
        }
        for (int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[0].length; j++){
                if (cells[i][j] != cells[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}



