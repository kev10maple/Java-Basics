SELECT title, noOfCopies
FROM (((tbl_author inner join tbl_book) inner join tbl_book_copies) inner join tbl_library_branch)
WHERE authorName = 'Stephen King' and branchName = 'Central'