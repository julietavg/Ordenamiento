package fciencias.edatos.practica05;
import java.util.Arrays;
import java.util.Random;

/**
 * Implementación de algunos algoritmos de ordenamiento.
 * @author Julieta Vargas Gutiérrez 318341945
 * @author Maria Reyes
 * @version 1.0 Noviembre 2021.
 * @since Estructuras de datos 2022-1.
 */
public class Sorter{
    
	/**
	 * Cambia de posición dos elementos entre sí de un arreglo de enteros.
	 * @param arr el arreglo del cual cambiar la posición de los elementos.
	 * @param i el índice del primer elemento a cambiar.
	 * @param j el índice del segundo elemento a cambiar.
	 */
	private static void swap(int[] arr, int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

        
   ///********* QUICKSORT
	/**
	 * Ordena un arreglo de forma ascendente con merge sort.
	 * @param arr el arreglo a ordenar.
	 */
	public static void quicksort(int[] arr){
		quicksort(arr, 0, arr.length-1);
	}
	/**
	 * Auxiliar de mergeSort para dividir y mezclar.
	 * @param arr el arreglo con los elementos a dividir y mezclar.
	 * @param lo el índice de inicio a modificación.
	 * @param hi el índice del último elemento a modificación.
	 */
	 private static void quicksort(int[] arr, int lo, int hi){
            if(hi <= lo) //Cuando el fragmento esta ordenado lo a hi 
                return;
            int j = partition(arr,lo,hi);
            quicksort(arr, lo , j-1);
            quicksort(arr, j+1,hi);
        
        }

	/**
	 * Mezcla dos arreglos, ordenando de menor a mayor.
	 * @param arr el arreglo con los elementos a modificar.
	 * @param lo el inicio de la primera mitad
	 * @param hi el índice del último elemento.
         * @return j
	 */
	
          public static int partition(int[]arr, int lo, int hi){
            int i = lo;
            int j = hi + 1;
            int piv = arr[lo];
            
            while(true){
               while(arr[++i]< piv) if(i == hi){
                    break;
                }               
               while(piv < arr[--j])if (j == lo){
                    break;
                }
                if (i >= j){
                    break;
                   
                }
             swap(arr, i , j);  
            }
             
            swap (arr,lo,j); 
             return j;   
            }
           
          // MERGESORT MEJORADO
          
          
          
          
          
          
            
         
	/**
	 * Crea un nuevo arreglo con números pseudoaleatorios.
	 * @param n el tamaño del arreglo a crear.
	 * @param max el mayor elemento a generar en el arreglo.
	 * @return un arreglo de tamaño n con números pseudoaleatorios de 0 a 19.
	 */
	public static int[] generate(int n, int max){
		int[] res = new int[n];
		Random rn = new Random();
		for(int i = 0 ; i < n; i++)
			res[i] = rn.nextInt(max);
		return res;
	}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       public static void main(String[] args) {
  
               int[] arr1 = generate(10000, 15);
         //int arr1= [10, 15];
                
		//int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		//int[] arr3 = Arrays.copyOf(arr1, arr1.length);
		//System.out.println("No ordenado: " + Arrays.toString(arr1));
		
		long inicio = System.currentTimeMillis();
		//selectionSort(arr1);
		long fin = System.currentTimeMillis();

		//System.out.println("Ordenado con selectionSort tardó: " + (fin - inicio) + " milisegundos");

		

		//inicio = System.currentTimeMillis();
		//insertionSort(arr2);
		//fin = System.currentTimeMillis();

		//System.out.println("Ordenado con insertionSort tardó: " + (fin - inicio) + " milisegundos");
		
		
		System.out.println("No ordenado: " + Arrays.toString(arr1));
		inicio = System.currentTimeMillis();
		quicksort(arr1);
		fin = System.currentTimeMillis();
		System.out.println("Ordenado: " + Arrays.toString(arr1));
		System.out.println("Ordenado con mergeSort tardó: " + (fin - inicio) + " milisegundos");
	} 
	
}
