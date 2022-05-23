/*
МАССИВЫ
 */
public class HomeWork5 {
    public static void main(String[] args) {
        // задача 1
        int[] weight = new int[3];
        float[] fWeight = {1.57f, 7.654f, 9.986f};
        int[] random = {1, 5, 3, 6, 8, 4, 7, 2, 9, 0};

        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
        }

        // задача 2
        System.out.println("Task 2:");
        for (int iVar : weight) {
            System.out.print(iVar + ", ");
        }
        System.out.println();
        for (float fVar : fWeight) {
            System.out.print(fVar + ", ");
        }
        System.out.println();
        for (int iVar : random) {
            System.out.print(iVar + ", ");
        }
        System.out.println();

        // задача 3
        System.out.println("Task 3:");
        for (int i = weight.length; i > 0; i--) {
            System.out.print(weight[i - 1] + ", ");
        }
        System.out.println();
        for (int i = fWeight.length; i > 0; i--) {
            System.out.print(fWeight[i - 1] + ", ");
        }
        System.out.println();
        for (int i = random.length; i > 0; i--) {
            System.out.print(random[i - 1] + ", ");
        }
        System.out.println();

        // задача 4
        System.out.println("Task 4:");
        for (int iVar : weight) {
            if (iVar % 2 != 0) {
                iVar++;
            }
            System.out.print(iVar + ", ");
        }
    }
}
