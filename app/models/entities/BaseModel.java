package models.entities;

import io.ebean.Model;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.Instant;

@MappedSuperclass
public class BaseModel extends Model {
   @Id
   private Long id;

   @WhenCreated
   private Instant createdAt;

   @WhenModified
   private Instant updatedAt;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Instant getCreatedAt() {
      return createdAt;
   }

   public void setCreatedAt(Instant createdAt) {
      this.createdAt = createdAt;
   }

   public Instant getUpdatedAt() {
      return updatedAt;
   }

   public void setUpdatedAt(Instant updatedAt) {
      this.updatedAt = updatedAt;
   }
}
