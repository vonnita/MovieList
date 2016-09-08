
	import java.util.ArrayList;
	import java.util.Scanner;

	
	public class MainMovies {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner scan1 = new Scanner(System.in);
			System.out.println("Welcome to the Movie List Application!");
			String choice = "yes";

			while (choice.equalsIgnoreCase("yes")) {
				ArrayList<Movies> movieList = new ArrayList();
				movieList.add(new Movies("Frozen", "Animated"));
				movieList.add(new Movies("Sponge Bob", "Animated"));
				movieList.add(new Movies("Hotel Transylvania", "Animated"));
				movieList.add(new Movies("The Green Mile", "Drama"));
				movieList.add(new Movies("Castaway", "Drama"));
				movieList.add(new Movies("Captain Phillips", "Drama"));
				movieList.add(new Movies("Friday the 13th", "Horror"));
				movieList.add(new Movies("Halloween", "Horror"));
				movieList.add(new Movies("Chuckie", "Horror"));
				movieList.add(new Movies("Harry Potter", "Scifi"));
				movieList.add(new Movies("Star Trek", "Scifi"));
				movieList.add(new Movies("Planet of the Apes", "Scifi"));
				String category = "";
				String title = "";

				System.out.println("There are 12 movies in our Movie List.");
				System.out.println(
						"What category are you interested in? (Please enter animated, drama, horror, scifi and don't you dare enter anything else!!!)");
				category = scan1.nextLine();

				Movies m1 = new Movies(title, category);
				m1.setCategory(scan1.toString());
				if (category.equalsIgnoreCase("animated") || category.equalsIgnoreCase("drama")
						|| category.equalsIgnoreCase("horror") || category.equalsIgnoreCase("scifi"))

				{
					System.out.println("Here are the movies in the " + category + " category: ");

					for (int a = 0; a < movieList.size(); a++) {

						if (category.equalsIgnoreCase(movieList.get(a).getCategory())) {

							System.out.println(movieList.get(a).getTitle());
							;
						}

					}
				} else {
					System.out.println(
							"You have entered an invalid input!");
					continue;
				}
				System.out.println("Continue?");
				choice = scan1.nextLine();
			}

		}

	}

