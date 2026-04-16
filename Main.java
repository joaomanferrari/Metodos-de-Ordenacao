public class Main { 
    public static void main(String[] args){
        Integer [] vetor = {5,2,8,1,3};

        //bubble sort
        BubbleSort<Integer> bubble = new BubbleSort<>();
        Integer[] ordenadoBubble = bubble.ordenar(vetor);

        //insertion sort  
        InsertionSort<Integer> insertion = new InsertionSort<>();
        Integer[] ordenadoInsertion = insertion.ordenar(vetor);

        //selection sort
        SelectionSort<Integer> selection = new SelectionSort<>();
        Integer[] ordenadoSelection = selection.ordenar(vetor);


        // mostrando vetor original
        System.out.println("Vetor original : ");
        for(Integer num : vetor){
        System.out.print(num +" ");
        }

        // mostrando vetor ordenado com bubble
        System.out.println("BubbleSort : ");
        for(Integer num : ordenadoBubble){
            System.out.print(num +" ");
        }
        
        // resultados bubble
        System.out.println("Resultados bubble : ");
        System.out.println("Comparações  : " + bubble.getComparacoes());
        System.out.println("Movimentações  : " + bubble.getMovimentacoes());
        System.out.println("Tempo da operação : "+ bubble.getTempoOrdenacao());


        // mostrando vetor ordenado com insertion
        System.out.println("InsertionSort : ");
        for(Integer num : ordenadoInsertion){
            System.out.print(num +" ");
        }

        //resultados insertion
        System.out.println("Resultados insertion : ");
         System.out.println("Comparações : " + insertion.getComparacoes());
        System.out.println("Movimentações  : " + insertion.getMovimentacoes());
        System.out.println("Tempo da operação : "+ insertion.getTempoOrdenacao());

        
        //mostrando vetor ordenado com selection
        System.out.println("SelectionSort : ");
        for(Integer num : ordenadoSelection){
            System.out.print(num +" ");
        }
        //resultados selection
        System.out.println("Resultados selection : ");
         System.out.println("Comparações : " + selection.getComparacoes());
        System.out.println("Movimentações  : " + selection.getMovimentacoes());
        System.out.println("Tempo da operação : "+ selection.getTempoOrdenacao());
        

    }       
}
