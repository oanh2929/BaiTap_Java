package Bai2_2;

public class TestBook {
        public static void main(String[] args) {
            // Tạo các đối tượng Author
            Author author1 = new Author("John Doe", "john@example.com", 'M');
            Author author2 = new Author("Jane Smith", "jane@example.com", 'F');

            // Tạo mảng Author
            Author[] authors = {author1, author2};

            // Tạo đối tượng Book
            Book book = new Book("Advanced Java", authors, 29.99, 100);

            // Kiểm tra các phương thức
            System.out.println(book); // In thông tin sách
            System.out.println("Author Names: " + book.getAuthorNames()); // In tên tác giả
        }
}
