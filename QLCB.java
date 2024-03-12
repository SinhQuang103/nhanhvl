package BTcanbo;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    public static <list> void main(String[] args) {
        ArrayList<CanBo> list = new ArrayList<>();
        list.add(new CanBo("Quang", 31, "Nam"));
        while (true) {
            System.out.println("============Danh Sach============" +
                    "\n1. Xem danh sach" +
                    "\n2. Them moi" +
                    "\n3. Tim kiem" +
                    "\n0. Thoat");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Danh sach la: ");
                for (int i=0; i< list.size(); i++){
                    System.out.println(list.get(i));
                }
            }
            if (choice == 2) {
                System.out.println("Nhap thong tin can bo: ");
                System.out.println("Nhap ten can bo: ");
                String hoten = scanner.nextLine();
                System.out.println("Nhap tuoi: ");
                int tuoi = scanner.nextInt();
                System.out.println("Nhap gioi tinh: ");
                String gioitinh = scanner.nextLine();
                list.add(new CanBo(hoten,tuoi,gioitinh));
            }
            if (choice == 3){
                System.out.println("Nhap ten can tim: ");
                scanner.nextLine();
                String hoten = scanner.nextLine();
                for (int i = 0; i< list.size();i++){
                    if (list.get(i).getHoten().equals(hoten)){
                        System.out.println(list.get(i));
                    }
                }
            }
            if (choice == 0 ){
                break;
            }
        }
    }
}

