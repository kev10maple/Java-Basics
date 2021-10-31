SELECT tbl_book.title, tbl_borrower.name, tbl_borrower.address FROM tbl_book, tbl_borrower, tbl_book_loans, tbl_library_branch
WHERE tbl_library_branch.branchName = 'Sharpstown' AND
tbl_library_branch.branchId = tbl_book_loans.branchID AND
tbl_book_loans.dueDate='2021-10-30' AND
tbl_book_loans.cardNo = tbl_borrower.cardNo AND
tbl_book_loans.bookId = tbl_book.bookId