import java.util.Scanner;
public class string {

	/**
	 * Marc Freytag
	 * FS23
	 * 201304
	 */
	public static void main(final String[] args) {
		final Scanner keyboard = new Scanner(System.in);
		int i = 0;
		final int ANZ = 3;

		final String vorname[] = new String[ANZ];
		final String nachname[] = new String[ANZ];
		final String strasse[] = new String[ANZ];
		final String hausnummer[] = new String[ANZ];
		final String plz[] = new String[ANZ];
		final String ort[] = new String[ANZ];

		final String trash[] = new String[ANZ];

		int wahl;
		int repeat = 1;

		System.out.println("Personenverwaltung");

		while (repeat == 1)
		{

			System.out.println("1. Eingabe aller Personendaten");
			System.out.println("2. Ausgabe aller Personendaten");
			System.out.println("3. Eingabe eines Datensatzes");
			System.out.println("4. Ausgabe eines Datensatzes");
			System.out.println("5. Beenden");
			System.out.println("Bitte waehlen Sie:");
			wahl = 0;
			wahl = keyboard.nextInt();
			if (wahl<6 && wahl>0)
			{
				switch (wahl)
				{
				case 1:
					i = 0;
					trash[i] = keyboard.nextLine();
					for (i=0; i<ANZ; i++)
					{

						System.out.println((i+1)+". Vorname:");
						vorname[i] = keyboard.nextLine();
						System.out.println((i+1)+". Nachname:");
						nachname[i] = keyboard.nextLine();
						System.out.println((i+1)+". Adresse");
						System.out.println("Strasse: ");
						strasse[i] = keyboard.nextLine();
						System.out.println("Hausnummer: ");
						hausnummer[i] = keyboard.nextLine();
						System.out.println("Postleitzahl: ");
						plz[i] = keyboard.nextLine();
						System.out.println("Ort: ");
						ort[i] = keyboard.nextLine();
					}
					System.out.println("Alle Personendaten wurden eingegeben.");
					break;

				case 2:
					for (i=0; i<ANZ; i++)
					{
						System.out.println((i+1)+". Vorname: "+vorname[i]);
						System.out.println((i+1)+". Nachname: "+nachname[i]);
						System.out.println((i+1)+". Adresse:\n"+strasse[i]+" "+hausnummer[i]);
						System.out.println(plz[i]+" "+ort[i]);
					}
					break;

				case 3:
				{
					System.out.println("Welcher Datensatz soll eingegeben werden? ");
					i = keyboard.nextInt();   
					i = i-1;
					if (i<ANZ && i>0)
					{
						trash[i] = keyboard.nextLine();
						System.out.println((i+1)+". Vorname:");
						vorname[i] = keyboard.nextLine();
						System.out.println((i+1)+". Nachname:");
						nachname[i] = keyboard.nextLine();
						System.out.println((i+1)+". Adresse");
						System.out.println("Strasse: ");
						strasse[i] = keyboard.nextLine();
						System.out.println("Hausnummer: ");
						hausnummer[i] = keyboard.nextLine();
						System.out.println("Postleitzahl: ");
						plz[i] = keyboard.nextLine();
						System.out.println("Ort: ");
						ort[i] = keyboard.nextLine();
						System.out.println("Alle Personendaten wurden eingegeben.");
					}
					else
					{
						System.out.println("Fehleingabe");
					}
				}
				break;

				case 4:
				{
					System.out.println("Welcher Datensatz soll ausgegeben werden? ");
					i = keyboard.nextInt();   
					i = i-1;
					if (i<ANZ && i>0)
					{
						System.out.println((i+1)+". Vorname: "+vorname[i]);
						System.out.println((i+1)+". Nachname: "+nachname[i]);
						System.out.println((i+1)+". Adresse:\n"+strasse[i]+" "+hausnummer[i]);
						System.out.println(plz[i]+" "+ort[i]);
					}
					else
					{
						System.out.println("Fehleingabe. Versuchen Sie erneut.");
					}
				}
				break;

				case 5:
				{
					repeat = 0;
					System.out.println("Das Programm wurde beendet.");
				}
				break;

				default: 
					System.out.println("Fehleingabe. Versuchen Sie erneut.");
				}
			}
			else
			{
				System.out.println("Fehleingabe. Versuchen Sie erneut.");
			}
		}
	}	
}
