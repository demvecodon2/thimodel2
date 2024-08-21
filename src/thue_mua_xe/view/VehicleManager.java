package thue_mua_xe.view;

import thue_mua_xe.demol.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Vehicle> vehicleList = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Tạo các đối tượng xe và nhập thông tin");
            System.out.println("2. Xuất bảng kê khai tiền thuế của các xe");
            System.out.println("3. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    displayTaxes();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }

    private static void addVehicle() {
        System.out.print("Nhập thông tin xe: ");
        String information = scanner.nextLine();
        System.out.print("Nhập trị giá xe: ");
        double value = scanner.nextDouble();
        System.out.print("Nhập dung tích xe (cc): ");
        double engineCapacity = scanner.nextDouble();
        scanner.nextLine();

        Vehicle vehicle = new Vehicle(information, value, engineCapacity);
        vehicleList.add(vehicle);
        System.out.println("Đăng ký xe thành công.");
    }

    private static void displayTaxes() {
        if (vehicleList.isEmpty()) {
            System.out.println("Chưa có xe nào được đăng ký.");
            return;
        }
        System.out.println("BẢNG KÊ KHAI TIỀN THUẾ:");
        for (Vehicle vehicle : vehicleList) {
            double tax = vehicle.calculateTax();
            System.out.printf("Thông tin xe: %s - Trị giá: %.2f - Dung tích: %.2f - Thuế phải nộp: %.2f%n",
                    vehicle.getInformation(), vehicle.getValue(), vehicle.getEngineCapacity(), tax);
        }
    }
}
