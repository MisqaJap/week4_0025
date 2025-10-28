import java.util.Scanner;

public class latihanIntegrasiGitHub {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String namaUser;
        String kotaUser;
        String provinsiUser;
        String hobiUser;
        int umurUser;
        int tahunLahir;
        String nomorHP;
        String nimUser;
        String universitasUser;
        String programStudi;

        System.out.println("Biodata");

        System.out.println("Nama: ");
        namaUser = myObj.nextLine();


        System.out.println("Kota: ");
        kotaUser = myObj.nextLine();

        System.out.println("Provinsi: ");
        provinsiUser = myObj.nextLine();

        System.out.println("Hobi: ");
        hobiUser = myObj.nextLine();

        System.out.print("Umur :");
        umurUser = myObj.nextInt();

        System.out.print("Tahun Lahir: ");
        tahunLahir = myObj.nextInt();

        myObj.nextLine();

        System.out.println("No. HP");
        nomorHP = myObj.nextLine();

        System.out.println("NIM: ");
        nimUser = myObj.nextLine();

        System.out.println("Universitas: ");
        universitasUser = myObj.nextLine();

        System.out.println("Program Studi: ");
        programStudi = myObj.nextLine();

        System.out.println("Biodata Mahasiswa : ");
        System.out.println("Nama : " + namaUser);
        System.out.println("Kota : " + kotaUser);
        System.out.println("Provinsi : " + provinsiUser);
        System.out.println("Hobi : " + hobiUser);
        System.out.println("Umur : " + umurUser);
        System.out.println("Tahun Lahir : " + tahunLahir);
        System.out.println("No HP : " + nomorHP);
        System.out.println("NIM : " + nimUser);
        System.out.println("Universitas : " + universitasUser);
        System.out.println("Program Studi : " + programStudi);

        myObj.close();
    }
}
