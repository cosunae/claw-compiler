if(__git_get_rev_hash)
	return()
endif()
set(__git_get_rev_hash YES)

function(git_get_rev_hash _repository _output)
  execute_process(
    COMMAND git log -1 --format=%h
    WORKING_DIRECTORY ${_repository}
    OUTPUT_VARIABLE output_hash
    OUTPUT_STRIP_TRAILING_WHITESPACE
  )
  set(${_output} ${output_hash} PARENT_SCOPE)
endfunction()