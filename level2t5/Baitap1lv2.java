/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.baitap2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Baitap1lv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so hang (m) cua mang: ");
        int soHang = sc.nextInt();
        System.out.println("nhap so cot (n) cua mang: ");
        int soCot = sc.nextInt();

        int mang[][] = new int[soHang][soCot];

        System.out.println("nhap cac phan tu cua ma tran: ");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("nhap phan tu [" + i + "][" + j + "]: ");
                mang[i][j] = sc.nextInt();
            }
        }

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

        int tong = 0;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                tong += mang[i][j];
            }
        }
        System.out.println("tong cac phan tu trong mang la: " + tong);
// bai 2
        System.out.print("nhap cap cua ma tran vuong: ");
        int n = sc.nextInt();

        int[][] matran = new int[n][n];

        System.out.println("nhap cac phan tu cua ma tran:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matran[i][j] = sc.nextInt();
            }
        }

        boolean tamGiacTren = true;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matran[i][j] != 0) {
                    tamGiacTren = false;
                    break;
                }
            }
            if (!tamGiacTren) {
                break;
            }
        }

        if (tamGiacTren) {
            System.out.println("ma tran la tam giac tren");
        } else {
            System.out.println("ma tran khong phai la tam giac tren");
        }

        boolean doiXungDuongCheoChinh = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matran[i][j] != matran[j][i]) {
                    doiXungDuongCheoChinh = false;
                    break;
                }
            }
            if (!doiXungDuongCheoChinh) {
                break;
            }
        }

        if (doiXungDuongCheoChinh) {
            System.out.println("ma tran doi xung qua duong cheo chinh");
        } else {
            System.out.println("ma tran khong doi xung qua duong cheo chinh");
        }

        boolean doiXungQuaTam = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matran[i][j] != matran[n - i - 1][n - j - 1]) {
                    doiXungQuaTam = false;
                    break;
                }
            }
            if (!doiXungQuaTam) {
                break;
            }
        }

        if (doiXungQuaTam) {
            System.out.println("ma tran doi xung tam");
        } else {
            System.out.println("ma tran khong doi xung tam");
        }
//bai 3        
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int t = matran[j][i];
                matran[j][i] = matran[j][n - i - 1];
                matran[j][n - i - 1] = t;
            }
        }
        System.out.println("ma tran sau khi hoan vi cac cot: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("arr[i][j] " + "");
            }
            System.out.println("");
        }
//bai 4       
        int[] tongDong = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tongDong[i] += matran[i][j];
            }
        }

        int dongLonNhat = 0;
        int tongLonNhat = tongDong[0];
        for (int i = 0; i < n; i++) {
            if (tongDong[i] > tongLonNhat) {
                dongLonNhat = i;
                tongLonNhat = tongDong[i];
            }
        }
        System.out.println("tong dong cua ma tran: ");
        for (int i = 0; i < n; i++) {
            System.out.println("dong " + (i + 1) + ": " + tongDong[i]);
        }
        System.out.println("dong co tong lon nhat la dong " + (dongLonNhat + 1) + " voi tong la " + tongLonNhat);
//bai 5
        int n1 = sc.nextInt();
        int[][] matran1 = new int[n1][n1];
        int[][] matran2 = new int[n1][n1];

        System.out.println("nhap cac phan tu cua ma tran thu nhat: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                matran1[i][j] = sc.nextInt();
            }
        }
        System.out.println("nhap cac phan tu cua ma tran thu hai: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                matran2[i][j] = sc.nextInt();
            }
        }
        int[][] tongMaTran = new int[n1][n1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                tongMaTran[i][j] = matran1[i][j] + matran2[i][j];
            }
        }

        System.out.println("ma tran tong: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.println(tongMaTran[i][j] + "");
            }
            System.out.println("");
        }

        int[][] hieu = new int[n1][n1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                hieu[i][j] = matran1[i][j] - matran2[i][j];
            }
        }
        System.out.println("ma tran hieu: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.println(hieu[i][j] + "");
            }
            System.out.println("");
        }
//bai 6        
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};

        int[][] C = addMatrices(A, B);
        System.out.println("tong ma tran C:");
        printMatrix(C);

        int[][] D = subtractMatrices(A, B);
        System.out.println("su khac biet cua ma tran B:");
        printMatrix(D);
//bai 7
        int[][] E = tinhTongMaTran(A, B);
        System.out.println("Ma tran tong E:");
        inMaTran(E);

        int[][] F = tinhHieuMaTran(A, B);
        System.out.println("Ma tran hieu F:");
        inMaTran(F);
    }
// bai 6
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] D = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                D[i][j] = A[i][j] - B[i][j];
            }
        }

        return D;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
//bai 7    
    public static int[][] tinhTongMaTran(int[][] A, int[][] B) {
        int n = A.length;
        int[][] E = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                E[i][j] = A[i][j] + B[i][j];
            }
        }
        return E;
    }

    public static int[][] tinhHieuMaTran(int[][] A, int[][] B) {
        int n = A.length;
        int[][] F = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                F[i][j] = A[i][j] - B[i][j];
            }
        }
        return F;
    }

    public static void inMaTran(int[][] maTran) {
        for (int[] row : maTran) {
            System.out.println(Arrays.toString(row));
        }
    }
}
