/*
МАССИВЫ ч.1
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

        System.out.println("Task 2:");
        for (int i = 0; i < weight.length-1; i++) {
            System.out.print(weight[i] + ", ");
        }
        System.out.println(weight[weight.length-1]);
        for (int i = 0; i < fWeight.length-1; i++) {
            System.out.print(fWeight[i] + ", ");
        }
        System.out.println(fWeight[fWeight.length-1]);
        for (int i = 0; i < random.length-1; i++) {
            System.out.print(random[i] + ", ");
        }
        System.out.println(random[random.length-1]);

        System.out.println("Task 3:");
        for (int i = weight.length-1; i > 0; i--) {
            System.out.print(weight[i] + ", ");
        }
        System.out.println(weight[0]);
        for (int i = fWeight.length-1; i > 0; i--) {
            System.out.print(fWeight[i] + ", ");
        }
        System.out.println(fWeight[0]);
        for (int i = random.length-1; i > 0; i--) {
            System.out.print(random[i] + ", ");
        }
        System.out.println(random[0]);

        System.out.println("Task 4:");
        for (int iVar : weight) {
            if (iVar % 2 != 0) {
                iVar++;
            }
            System.out.print(iVar + " ");
        }
    }
}
