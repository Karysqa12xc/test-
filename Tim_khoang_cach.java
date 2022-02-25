import java.util.Scanner;

public class Tim_khoang_cach {
	/*
	 * Nhập vào tọa độ x,y của 3 điểm D1, D2, D3. Yêu cầu:
	 * 1.Tìm điểm nằm xa/gần gốc tọa độ nhất 
	 * 2.Kiểm tra xem 3 điểm đó có tạo thành 3 đỉnh của một tam giác không?
	 */
	public static void main(String[] args) {
		// Nhập tung độ hoành độ của D1
		double x1, y1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tung do D1: ");
		x1 = sc.nextDouble();
		System.out.println("Nhap hoanh do D1: ");
		y1 = sc.nextDouble();

		// Nhập tung độ hoành độ của D2
		double x2, y2;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap tung do D2: ");
		x2 = sc2.nextDouble();
		System.out.println("Nhap hoang do D2: ");
		y2 = sc2.nextDouble();

		// Nhập tung độ hoành độ của D3
		double x3, y3;
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Nhap tung do D3: ");
		x3 = sc3.nextDouble();
		System.out.println("Nhap hoang do D3: ");
		y3 = sc3.nextDouble();

		// Hiển thị tung độ và hoành độ D1
		System.out.println("Hien thi D1: ");
		System.out.println("D1(" + x1 + ", " + y1 + ")");
		System.out.print("-----------\n");

		// Hiển thị tung độ và hoành độ D2
		System.out.println("Hien thi D2: ");
		System.out.println("D2(" + x2 + ", " + y2 + ")");
		System.out.print("-----------\n");

		// Hiện thị tung độ và hoành độ D3
		System.out.println("Hien thi D3: ");
		System.out.println("D3(" + x3 + ", " + y3 + ")");
		System.out.print("-----------\n");

		// Tính khoảng cách D1 vs gốc tọa độ
		double Khoang_cach_1;
		Khoang_cach_1 = Math.sqrt(Math.pow((x1 - 0), 2) + Math.pow((y1 - 0), 2));
		System.out.println("Hien thi khoang canh cua D1 va goc toa do la: " + Khoang_cach_1);
		System.out.println("______________________");

		// Tính khoảng cách D2 và gốc tọa độ
		double Khoang_cach_2;
		Khoang_cach_2 = Math.sqrt(Math.pow((x2 - 0), 2) + Math.pow((y2 - 0), 2));
		System.out.println("Hien thi khoang canh cua D2 va goc toa do la: " + Khoang_cach_2);
		System.out.println("______________________");

		// Tính khoảng cách D3 và gốc tọa độ
		double Khoang_cach_3;
		Khoang_cach_3 = Math.sqrt(Math.pow((x3 - 0), 2) + Math.pow((y3 - 0), 2));
		System.out.println("Hien thi khoang canh cua D3 va goc toa do la: " + Khoang_cach_3);
		System.out.println("______________________");

		// 1. Tìm điểm xa/gần gốc tọa độ nhất
		// Xa gốc tọa độ nhất
		if (Khoang_cach_1 > Khoang_cach_2 && Khoang_cach_1 > Khoang_cach_3) {
			System.out.println("Diem xa goc toa do nhat la D1:" + Khoang_cach_1);
			System.out.println("______________________");
		} else if (Khoang_cach_2 > Khoang_cach_1 && Khoang_cach_2 > Khoang_cach_3) {
			System.out.println("Diem xa goc toa do nhat la D2:" + Khoang_cach_2);
			System.out.println("______________________");
		} else {
			System.out.println("Diem xa goc toa do nhat la D3:" + Khoang_cach_3);
			System.out.println("______________________");
		}
		// Điểm gần gốc tọa độ nhất
		if (Khoang_cach_1 < Khoang_cach_2 && Khoang_cach_1 < Khoang_cach_3) {
			System.out.println("Diem gan goc toa do nhat la D1:" + Khoang_cach_1);
			System.out.println("______________________");
		} else if (Khoang_cach_2 < Khoang_cach_1 && Khoang_cach_2 < Khoang_cach_3) {
			System.out.println("Diem gan goc toa do nhat la D2:" + Khoang_cach_2);
			System.out.println("______________________");
		} else {
			System.out.println("Diem gan goc toa do nhat la D3:" + Khoang_cach_3);
			System.out.println("______________________");
		}

		// 2. Kiểm tra 3 điểm có tạo thành 1 tam giác không
		// Khoảng cách giữa D1 và D2:
		double Kc1;
		Kc1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Hien thi khoang canh cua D1 va D2: " + Kc1);
		System.out.println("______________________");
		// Khoảng cách giữa D2 và D3:
		double Kc2;
		Kc2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		System.out.println("Hien thi khoang canh cua D2 va D3: " + Kc2);
		System.out.println("______________________");
		// Khoảng cách giữa D1 và D3:
		double Kc3;
		Kc3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		System.out.println("Hien thi khoang canh cua D1 va D3: " + Kc3);
		System.out.println("______________________");
		// Kiểm tra xem 3 điểm D1, D2, D3 có tạo thành 1 tam giác không?
		if ((Kc1 + Kc2 > Kc3) || (Kc1 + Kc3 > Kc2) || (Kc2 + Kc3 > Kc1)) {
			System.out.println("Ba diem D1, D2, D3 co tao thanh tam giac");
		} else {
			System.out.println("Ba diem khong tao thanh 1 tam giac");
		}

	}
}
