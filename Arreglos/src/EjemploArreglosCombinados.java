public class EjemploArreglosCombinados {
    public static void main(String[] args){

        int[] a,b,c;
        a = new int[10];
        b = new int[10];
        c = new int[a.length + b.length];

        for(int i = 0; i < a.length; i ++){
            a[i] = i + 1;
        }

        for(int i = 0; i< b.length;i++){
            b[i] = (i + 1)*5;
        }

        /*
        //combinar los arrays a y b.
        int aux = 0;
        for(int i = 0; i < c.length/2; i++){
            c[aux++] = a[i];
            c[aux++] = b[i];
        }
        */

        // asignando 2 valores a la vez.
        int aux = 0;
        for(int i = 0; i < c.length/2; i+= 2){
            for (int j = 0; j < 2; j++){
                c[aux++] = a[i+j];
            }
            for (int j = 0; j < 2; j++){
                c[aux++] = b[i +j];
            }
        }

        //Leyendo c
        for (int i = 0; i < c.length; i++){
            System.out.println(i + " = " + c[i]);
        }
    }
}