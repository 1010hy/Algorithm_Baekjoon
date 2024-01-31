import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[1001]; // 배열 생성

		int temp;

		int n = sc.nextInt(); // 배열에 들어갈 숫자 개수

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		for (int j = 0; j < n; j++) {
			int min = 1001;
			int min_dir = 1001;
			for (int i = j; i < n; i++) {
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
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);

		}

	}

}
