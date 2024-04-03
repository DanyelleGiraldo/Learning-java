public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Contador para mantener el número de elementos que no son iguales a val
        
        // Iterar sobre todos los elementos del array
        for (int i = 0; i < nums.length; i++) {
            // Si el elemento actual no es igual a val
            if (nums[i] != val) {
                nums[k] = nums[i]; // Movemos el elemento a la posición k
                k++; // Incrementamos k
            }
        }
        
        return k; // Devolver el número de elementos que no son iguales a val
    }
}
