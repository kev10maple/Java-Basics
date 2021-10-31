SELECT tbl_library_branch.branchName, COUNT(*)
FROM tbl_book_loans, tbl_library_branch
WHERE tbl_book_loans.branchId = tbl_library_branch.branchId
GROUP BY tbl_library_branch.branchId