/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.baitap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Baitap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//bai 1
        System.out.println("nhap so hang cua mang: ");
        int soHang = sc.nextInt();
        System.out.println("nhap so cot cua mang: ");
        int soCot = sc.nextInt();

        int mang[][] = new int[soHang][soCot];

        System.out.println("nhap cac phan tu cua mang: ");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("nhap phan tu [" + i + "][" + j + "]: ");
                mang[i][j] = sc.nextInt();
            }
        }

        int tong = 0;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                tong += mang[i][j];
            }
        }
        System.out.println("tong cac phan tu trong mang la: " + tong);
// bai 2
        int lonNhat = mang[0][0];
        int nhoNhat = mang[0][0];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (mang[i][j] > lonNhat) {
                    lonNhat = mang[i][j];
                }
                if (mang[i][j] < nhoNhat) {
                    nhoNhat = mang[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat trong mang: " + lonNhat);
        System.out.println("phan tu nho nhat trong mang: " + nhoNhat);
// bai 3
        System.out.println("tong cac hang: ");
        for (int i = 0; i < soHang; i++) {
            int tongHang = 0;
            for (int j = 0; j < soCot; j++) {
                tongHang += mang[i][j];
            }
            System.out.println("tong hang " + i + ": " + tongHang);
        }

        System.out.println("tong cac cot: ");
        for (int j = 0; j < soCot; j++) {
            int tongCot = 0;
            for (int i = 0; i < soHang; i++) {
                tongCot += mang[i][j];
            }
            System.out.println("tong cot " + j + ": " + tongCot);
        }
// bai 4
        for (int i = 0; i < soHang; i++) {
            int max = mang[i][0];
            for (int j = 1; j < soCot; j++) {
                if (mang[i][j] > max) {
                    max = mang[i][j];
                }
            }
            System.out.println("so lon nhat cua hang " + i + ": " + max);
        }
// bai 5
        boolean doixung = true;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (mang[i][j] != mang[j][i]) {
                    doixung = false;
                    break;
                }
            }
            if (!doixung) {
                break;
            }
        }

        if (doixung) {
            System.out.println("Ma tran doi xung");
        } else {
            System.out.println("Ma tran khong doi xung");
        }
// bai 6
        int tinhTongDuongCheoChinh = 0;
        for (int i = 0; i < soHang; i++) {
            tinhTongDuongCheoChinh += mang[i][i];
        }
        System.out.println("tong duong cheo chinh: " + tinhTongDuongCheoChinh);
// bai 7
        int tinhTongSoNguyen = 0;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (tongSoNguyen(mang[i][j])) {
                    tinhTongSoNguyen += mang[i][j];
                }
            }
        }
        System.out.println("tong cac so nguyen trong mang: " + tinhTongSoNguyen);
// bai 8
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot - 1; j++) {
                for (int k = j + 1; k < soCot; k++) {
                    if (mang[i][j] > mang[i][k]) {
                        int temp = mang[i][j];
                        mang[i][j] = mang[i][k];
                        mang[i][k] = temp;
                    }
                }
            }
        }

        System.out.println("Ma tran sau khi sap xep:");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(mang[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean tongSoNguyen(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
