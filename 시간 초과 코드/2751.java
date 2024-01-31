//시간 초과 코드

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[1000000];

		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}

		quickSort(data, 0, n-1);

		for (int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}

	public static void quickSort(int[] data, int start, int end) {
		
		if (start>=end) {
			return;
		}
		
		int pivot_dir = start;
		int i = start + 1; // i는 pivot의 오른쪽 위치
		int j = end; // j는 pivot의 마지막 위치
		int temp;

		while (i <= j) {
			while (data[i] <= data[pivot_dir]) {
				i++;
			}

			while (data[j] >= data[pivot_dir] && pivot_dir < j) {
				j--;
			}

			if (i > j) {	//엇갈리면
				temp = data[j];
				data[j] = data[pivot_dir];
				data[pivot_dir] = temp;

			} else {	//엇갈리지 않으면
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		
		quickSort(data, start, j - 1);
		quickSort(data, j + 1, end);
	}
}
