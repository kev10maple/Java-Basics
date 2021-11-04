SELECT title, noOfCopies FROM tbl_book
INNER JOIN tbl_author ON tbl_author.authorId = tbl_book.authId
INNER JOIN tbl_book_copies ON tbl_book_copies.bookId = tbl_book.bookId
INNER JOIN tbl_library_branch ON tbl_library_branch.branchId = tbl_book_copies.branchId
WHERE authorName = 'Stephen King' AND branchName = 'Central'
