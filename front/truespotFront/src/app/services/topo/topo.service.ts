import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {FormGroup} from "@angular/forms";
import {Observable} from "rxjs";
import {Topo} from "../../../model/topo";
import {TokenStorageService} from "../auth/token-storage.service";

@Injectable({
  providedIn: 'root'
})

export class TopoService {

  private topoUrl = 'http://localhost:8080/topo';

  constructor(private http:HttpClient, private tokenStorage: TokenStorageService) { }

  saveTopo(form: FormGroup): Observable<Topo> {
    return this.http.post<Topo>(this.topoUrl, {"name": form.get("name").value, "idDepartment": form.get("department").value.id, "userPseudo": this.tokenStorage.getPseudo() });
  }

  getTopo(id: string) {
    console.log("idTopo: ", id)
   return this.http.get<Topo>( this.topoUrl+'/getTopo',
      {
        params: new HttpParams()
          .set('id', id),
      });
  }
}
