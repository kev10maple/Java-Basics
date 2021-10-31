SELECT noOfCopies FROM tbl_book, tbl_book_copies, tbl_library_branch
WHERE title = 'The Lost Tribe' and branchName = 'Sharpstown'
