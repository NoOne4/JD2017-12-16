package by.it.pozdeev.jd01_07;

import by.it.pozdeev.jd01_09.Var;

public class Matrix extends Var {
    private double[][] value;

    Matrix(double[][] value) {
        this.value = new double[value.length][value[0].length];
        for (int i = 0; i < this.value.length; i++) {
            System.arraycopy(value[i], 0, this.value[i], 0, value[i].length);
        }
    }

    Matrix(Matrix matrix) {
        this(matrix.value);
    }
    Matrix(String strMatrix){
        String[] str=strMatrix.substring(2,strMatrix.length()-2).split(",");
        for (int i = 0; i < str.length; i++) {
           str[i]=str[i].replaceAll("}"," ");
           str[i]=str[i].replaceAll("\\{"," ");
           str[i]=str[i].trim();
        }
        int a=0;
        this.value=new double[str.length/2][str.length/2];
        for (int i = 0; i < str.length/2; i++) {
            for (int j = 0; j < str.length/2; j++) {
                this.value[i][j]=Double.parseDouble(str[a++]);
            }

        }
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append('{');
        for (int i = 0; i < value.length; i++) {
            result.append("{");
            for (int j = 0; j < value[0].length; j++) {
                result.append(value[i][j]);
                if (j != value[0].length-1 && i==value.length-1) result.append(", ");
                if (j != value[0].length-1 && i!=value.length-1) result.append(", ");
                if (j == value[0].length-1 && i!=value.length-1) result.append("}, ");
                if (j == value[0].length-1 && i==value.length-1) result.append("}");
            }
        }
        result.append('}');
        return result.toString();
    }

}
