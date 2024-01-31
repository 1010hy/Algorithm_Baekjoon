import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[4];
		int temp;

		for (int i = 0; i < 3; i++) {
			array[i] = sc.nextInt();
		}

		for (int j = 0; j < 3; j++) {
			int min = 1000001;
			int min_dir = 4;
			for (int i = j; i < 3; i++) {
				if (min > array[i]) {
					min = array[i];
					min_dir = i;
				}
			}

			temp = array[j];
			array[j] = array[min_dir];
			array[min_dir] = temp;
		}

		// 최종 결과 출력
		for (int i = 0; i < 3; i++) {
			System.out.print(array[i] + " ");

		}

	}

}
