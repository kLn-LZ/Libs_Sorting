package kLn.Order;

public class ControllerOrdenacao {

    public ControllerOrdenacao(){

        super();

    }


    public int[] quickSort (int[] v, int start, int end) {

        if(end > start) {

            int fixedPivotPosition = divide(v, start, end);
            quickSort(v, start, fixedPivotPosition - 1);
            quickSort(v, fixedPivotPosition + 1, end);

        }

        return v;

    }

    private int divide (int[] v, int start, int end) {
        int crL = start + 1;
        int crR = end;
        int pivot = v[start];

        while(crL <= crR){
            while(crL <= crR && v[crL] <= pivot) {

                crL++;

            }
            while(crR >= crL && v[crR] > pivot) {

                crR--;

            }

            if (crL < crR) {
                sweapArrays(v, crL, crR);
                crL++;
                crR--;
            }
        }

        sweapArrays(v, start, crR);
        return crR;
    }


    private void sweapArrays (int[] v, int i, int j) {

        int aux = v[j];
        v[j] = v[i];
        v[i] = aux;
    }

}
