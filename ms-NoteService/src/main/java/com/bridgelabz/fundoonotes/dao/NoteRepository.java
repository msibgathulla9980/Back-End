
package com.bridgelabz.fundoonotes.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bridgelabz.fundoonotes.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {
	
	List<Note> findAllByUserId(int userId);

	Optional<Note> findByUserIdAndNoteId(int userId, int noteId);
	
	Optional<Note> findBynoteId(int noteId);
	
	Note findByNoteId(int noteId);
	
	Note findByUserId(int userId);
	
	
	
	
	
	// List<Note> findAllByUserIdAndIsArchive(int userId, boolean isArchiveOrNot);
	
//	List<Note> findAllByUserIdAndIsPinned(int userId, boolean IsPinnedOrNot);
//	
//	List<Note> findAllByUserIdAndInTrash(int userId, boolean isInTrashOrNot);
}