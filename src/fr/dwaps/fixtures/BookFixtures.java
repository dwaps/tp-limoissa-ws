package fr.dwaps.fixtures;

import java.util.ArrayList;
import java.util.List;

import fr.dwaps.model.beans.Book;
import fr.dwaps.model.dao.DAOFactory;

public final class BookFixtures {
	private BookFixtures() {}
	
	public static void fillDataBase() {
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(
			"Il était une fois",
			"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint totam maxime quo facere magnam doloremque repudiandae vero voluptas vitae voluptatibus doloribus ut temporibus architecto nemo commodi in ab. Cupiditate repellat.",
			"Michal Douglas",
			"livre1.jpg",
			12.2, true
		));
		books.add(new Book(
			"Comment ça se passe au loin",
			"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint totam maxime quo facere magnam doloremque repudiandae vero voluptas vitae voluptatibus doloribus ut temporibus architecto nemo commodi in ab. Cupiditate repellat.",
			"Evelyne Duranger",
			"livre2.jpg",
			5, true
		));
		books.add(new Book(
			"Biographie d'un poulpe ennuyeux",
			"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint totam maxime quo facere magnam doloremque repudiandae vero voluptas vitae voluptatibus doloribus ut temporibus architecto nemo commodi in ab. Cupiditate repellat.",
			"Françoise Destables",
			"",
			8, false
		));
		books.add(new Book(
			"Coco Jaco chez les indiens",
			"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint totam maxime quo facere magnam doloremque repudiandae vero voluptas vitae voluptatibus doloribus ut temporibus architecto nemo commodi in ab. Cupiditate repellat.",
			"Pascal Héreule",
			"livre1.jpg",
			11.28, true
		));
		books.add(new Book(
			"Faire ou ne pas faire",
			"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint totam maxime quo facere magnam doloremque repudiandae vero voluptas vitae voluptatibus doloribus ut temporibus architecto nemo commodi in ab. Cupiditate repellat.",
			"André Dubois",
			"livre2.jpg",
			4.5, false
		));
		books.add(new Book(
			"Coco Jaco à la campagne",
			"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint totam maxime quo facere magnam doloremque repudiandae vero voluptas vitae voluptatibus doloribus ut temporibus architecto nemo commodi in ab. Cupiditate repellat.",
			"Céline Durand",
			"",
			778, true
		));
		
		books.forEach(b -> DAOFactory.getBookDAO().create(b));
	}
}
