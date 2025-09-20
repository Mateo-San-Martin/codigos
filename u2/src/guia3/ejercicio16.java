package guia3;

public class ejercicio16 {
    public static void main(String[] args) {
        int[] precios = {1,2,3,4,15};
        int dias = 4;
        System.out.println(gananciaAccion(precios, dias));
    }
    public static double gananciaAccion(int[] precios, int dias){
        for (int i = 0; i < precios.length; i++) {
            if(dias == i){
                return precios[i];
            }
        }
        return 0;
    }

}


//Dado un vector precios donde precios[i] representa el precio de una acción en el día i. Se
//desea maximizar la ganancia eligiendo un solo día para comprar una acción y eligiendo un día
//diferente en el futuro para vender esa acción.
//Realice una función que reciba como parámetro de entrada el array precios y que devuelva ganancia
//máxima que se pueda obtener. Si no se puede obtener ninguna ganancia, devolver 0.
