public class Main {

    public static void imprimeMatriz(double[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }    

    public static void testToString (){
        Matrix a = new Matrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Matrix b = new Matrix(new double[][]{
            {12, 10, 8},
            {7, 6, 5},
            {4, 3, 2}
        });
    
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void testToArray (){
        Matrix a = new Matrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        double[][] cells = a.toArray();
        System.out.println("Convertendo Matrix em Array:");
        imprimeMatriz(cells);       

        for(int i=0; i<cells.length; i++){
            for(int j=0; j<cells[0].length; j++){
                cells[i][j] = 1;
            }
        }
        System.out.println("Alterando o Array recebido do objeto Matrix:");
        imprimeMatriz(cells);
        System.out.println("Alteracao nao propaga no objeto Matrix:");
        System.out.println(a);
    }

    public static void testRowColumnsGetAt(){
        Matrix a = new Matrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Matrix b = new Matrix(new double[][]{
            {12, 10, 8},
            {7, 6, 5},
        });

        System.out.println("O Objeto a eh uma matriz " + a.getRows() + "x" + a.getColumns());
        System.out.println("O Objeto b eh uma matriz " + b.getRows() + "x" + b.getColumns());

        System.out.println("Valor da matriz a em [1][1] eh: " + a.getAt(1, 1));
        //System.out.println("Valor da matriz a em [3][3] (invalida) eh: " + a.getAt(3, 3));

    }

    public static void testPlusMinus(){
        Matrix a = new Matrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Matrix b = new Matrix(new double[][]{
            {12, 10, 8},
            {7, 6, 5},
            {4, 3, 2}
        });

        Matrix c = new Matrix(new double[][]{
            {4, 8, 12},
            {3, 6, 9},
            {1, 2, 3},
            {5, 10, 15}
        });

        System.out.println("Matriz a: ");
        System.out.println(a);
        System.out.println("Matriz b: ");
        System.out.println(b);
        System.out.println("Matriz a + Matriz b: ");
        System.out.println(a.plus(b));
        // System.out.println("Matriz a + Matriz c: (INCOMPATIVEIS)");
        // System.out.println(a.plus(c));
        System.out.println("Matriz a - Matriz b: ");
        System.out.println(a.minus(b));
        System.out.println("Matriz a - Matriz c: (INCOMPATIVEIS)");
        System.out.println(a.minus(c));
    }

    public static void testTimes(){
        Matrix a = new Matrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Matrix b = new Matrix(new double[][]{
            {12, 10, 8},
            {7, 6, 5},
            {4, 3, 2}
        });

        Matrix c = new Matrix(new double[][]{
            {4, 8, 12, 6},
            {3, 6, 9, 8},
            {1, 2, 3, 5}
        });

        System.out.println("Matriz a: ");
        System.out.println(a);
        System.out.println("Matriz b: ");
        System.out.println(b);
        System.out.println("Matriz axb: ");
        System.out.println(a.times(b));
        System.out.println("Matriz 2*a: ");
        System.out.println(a.times(2));
        System.out.println("Matriz axc: ");
        System.out.println(a.times(c));
        //System.out.println("Matriz cxa: (INCOMPATIVEIS) ");
        //System.out.println(c.times(a));
    }

    public static void testTranspose(){
        Matrix a = new Matrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Matrix b = new Matrix(new double[][]{
            {12, 10, 8},
            {7, 6, 5},
            {4, 3, 2}
        });
        System.out.println("Matriz a: ");
        System.out.println(a);
        System.out.println("Matriz a transposta: ");
        System.out.println(a.getTranspose());
        System.out.println("Matriz b: ");
        System.out.println(b);
        System.out.println("Matriz b transposta: ");
        System.out.println(b.getTranspose());
    }

    public static void tesIsSquare(){
        Matrix a = new Matrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Matrix b = new Matrix(new double[][]{
            {4, 8, 12, 6},
            {3, 6, 9, 8},
            {1, 2, 3, 5}
        });
        System.out.println("Matriz a: ");
        System.out.println(a);
        System.out.println("Matriz a eh quadrada? " + a.isSquare());
        System.out.println("Matriz b: ");
        System.out.println(b);
        System.out.println("Matriz b eh quadrada? " + b.isSquare());
        
    }

    public static void testIsSymmetric(){
        Matrix a = new Matrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Matrix b = new Matrix(new double[][]{
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        });
        System.out.println("Matriz a: ");
        System.out.println(a);
        System.out.println("Matriz a eh simetrica? " + a.isSymmetric());
        System.out.println("Matriz b: ");
        System.out.println(b);
        System.out.println("Matriz b eh simetrica? " + b.isSymmetric());
    }
    public static void main(String[] args) {
        //testToString();
        //testToArray();
        //testRowColumnsGetAt();
        //testPlusMinus();
        //testTimes();
        //testTranspose();
        //tesIsSquare();
        testIsSymmetric();
    }
}
