SELECT branchId, noOfCopies FROM tbl_book, tbl_book_copies
WHERE title = 'The Lost Tribe'
GROUP BY branchID