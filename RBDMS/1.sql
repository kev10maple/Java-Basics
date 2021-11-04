SELECT noOfCopies FROM tbl_book_copies
INNER JOIN tbl_library_branch ON tbl_book_copies.branchId = tbl_library_branch.branchId
INNER JOIN tbl_book ON tbl_book.bookId = tbl_book_copies.bookId
WHERE title = 'The Lost Tribe' AND branchName = 'Sharpstown'

