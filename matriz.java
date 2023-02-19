package matrices;

public class matriz {
	
	public class mutiplicacion {
		
		public static boolean multmatrices(int[][] A,int [][] B, int [][] C) {
			
			boolean iguales = true;
			
			if (A[0].length != B.length)
				iguales = false; 
			
			else 
				for (int i = 0; i < A.length; i++) {
					for (int j=0; j < B[i].length; j++) {
						for (int k=0; k < B.length; k++) {
							
							C[i][j] += A[i][k] * B[k][j];  
						}
					}
				}
			return iguales; 
		}

		public static void mostrarMatriz (int [][] m) {
			
			System.out.println("La matriz resultante es: " +m);  
			
			for (int i = 0; i < m.length; i++) {
				for (int j=0; j < m[i].length; j++) {
					
					System.out.print(m [i][j] + " "); 
				}
				System.out.println(); 
			}
		}
		public static void main(String[]args) {
			int [][] A = { { 6, 5},
					        { 3, 2} };
			
			int [][] B = { { 5, 4}, 
			                { 5, 2} };
			
			int [][] C = new int [2][2]; 
			
			if (multmatrices (A, B, C))
				mostrarMatriz(C); 
			else 
				System.out.println("Las matrices no son compatibles"); 
				
			}			
	}

	public class transpuesta {
		
		public static void main(String[]args) {
		
			int A [][]= { { 6, 5, 4},
						  { 4, 3, 5},
						  { 7, 4, 7}}; 
			int aux;
			
			for (int i=0; i<3; i++) {
				for (int j=0; j<i; j++) {
					aux = A[i][j]; 
					A[i][j] = A[j][i]; 
					A[j][i] = aux;
				}
			}
			
			System.out.println("La matriz transpuesta queda: ");
			for (int i=0; i<3; i++) {
				for (int j=0; j<3; j++) {
					System.out.print(A[i][j]+" "); 
				}
				System.out.println("");  
			}
			
		}

	}


	public class sumaDiagonal {
		
		public static void main(String[]args) { 
			
			int A [][] = {{ 4, 6, 7},
						  { 5, 6, 10},
						  { 8, 2, 3}}; 
			
			int diagonalPrincipal [] = new int [A.length]; 
			
			for (int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(i==j) {
						diagonalPrincipal[i]=A[i][j]; 
					}
					
				}
			}
			int suma=0; 
			System.out.print("Los elementos de tu diagonal principal son:" ); 
			for(int elemento:diagonalPrincipal) {
					System.out.print(" "+elemento); 
					suma=suma+elemento;  
			}
			System.out.println(""); 
			System.out.println("La suma de tus elementos de la diagonal principal es: " +suma);
				
		}
			
	}


	public class maximo {
		
		public static void main (String[]args) { 
			
			int A[][]= {{ 100, 101},
						{ 607, 105}};
			
			int elementoMayor = A [0][0]; 
			
			for (int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					if (A[i][j] > elementoMayor) {
						elementoMayor = A[i][j];
						
					}
					
				}
			}
			
			System.out.println("El elemento mayor de la matriz es: "+elementoMayor); 
		}

	}
	 
	public class sumaMatrices {
		
		public static void main (String[]args) {
			
			int [][] A = { { 10, 11},
						   { 12, 12} };

			int [][] B = { { 5, 4}, 
						   { 5, 2} };

			int [][] C = new int [2][2];
			
			for (int i=0; i<2; i++) {
				for (int j=0; j<2; j++) {
					C [i][j] = A[i][j] + B[i][j]; 
				}
			}
			
			System.out.println("La matriz de la suma de las matrices A y B son: ");
			for (int i=0; i<2; i++) {
				for (int j=0; j<2; j++) {
					System.out.print(A [i][j] + B [i][j]); 
					System.out.print("   "); 
				}
				System.out.println(""); 
			}
		}

	}

	public class matrizPoreEscalar {
		
		public static void main (String []args) {
			
			int [][] A = {{ 8, 3},
						  { 3, 7}};
			
			int [][] B = new int [2][2];  
			
			int escalar = 3;
			
			for (int i=0; i<2; i++) {
				for (int j=0; j<2; j++) {
					B [i][j] = A[i][j] * escalar; 
				}
			
			}
			
			System.out.println("La multiplicacion de la matriz por el escalar es: "); 
			for (int i=0; i<2; i++) {
				for (int j=0; j<2; j++) {
					System.out.print( A[i][j] * escalar);
					System.out.print(" ");
				}
				System.out.println(""); 
			}
			
		}

	}

}
