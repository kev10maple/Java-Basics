SELECT name FROM tbl_borrower
WHERE NOT EXISTS (SELECT * FROM tbl_book_loans WHERE tbl_borrower.cardNo = tbl_book_loans.cardNo);