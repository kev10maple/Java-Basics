SELECT branchName, noOfCopies FROM tbl_book_copies
INNER JOIN tbl_book ON tbl_book.bookId = tbl_book_copies.bookId
INNER JOIN tbl_library_branch ON  tbl_library_branch.branchId = tbl_book_copies.branchId
WHERE title = 'The Lost Tribe'