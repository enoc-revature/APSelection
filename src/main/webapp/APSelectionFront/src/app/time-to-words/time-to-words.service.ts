import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TimeToWordsService {

  constructor(private http: HttpClient) { }

  url = "http://localhost:8080/time-to-words";

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  obj = {
    h: "",
    m: ""
  };
  getWords(obj: Object): Observable <string> {
    return this.http.post<string>(this.url, obj);
  }
}
