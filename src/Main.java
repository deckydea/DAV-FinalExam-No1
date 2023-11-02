import member.BasicMember;
import member.GoldMember;
import member.Member;
import member.PlatinumMember;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah member.Member");
            System.out.println("2. Tampilkan Data member.Member");
            System.out.println("3. Record Belanja");
            System.out.println("4. Keluar");

            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama member: ");
                    String memberName = scanner.next();
                    System.out.print("Pilih level member (Basic/Gold/Platinum): ");
                    String memberLevel = scanner.next();

                    Member newMember = createMember(memberName, memberLevel);
                    members.add(newMember);
                    System.out.println("member.Member berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.println("Daftar member.Member:");
                    for (Member member : members) {
                        System.out.println(member);
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nomor member: ");
                    int memberNumber = scanner.nextInt();
                    if (memberNumber >= 1 && memberNumber <= members.size()) {
                        System.out.print("Masukkan total belanja: ");
                        int totalBelanja = scanner.nextInt();
                        members.get(memberNumber - 1).belanja(totalBelanja);
                        System.out.println("Record belanja berhasil disimpan.");
                    } else {
                        System.out.println("Nomor member tidak valid.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih kembali.");
            }

            System.out.println("\n");
        }
    }

    private static Member createMember(String name, String level) {
        level = level.toLowerCase();
        switch (level) {
            case "basic":
                return new BasicMember(name);
            case "gold":
                return new GoldMember(name);
            case "platinum":
                return new PlatinumMember(name);
            default:
                System.out.println("Level member tidak valid. member.Member baru akan menjadi Basic.");
                return new BasicMember(name);
        }
    }
}
