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
    h: 0,
    m: 0
  };

  getWords(obj: Object): Observable <string> {
    this.obj.h = parseInt(document.getElementById("hourId").innerHTML);
    this.obj.m = parseInt(document.getElementById("minuteId").innerHTML);
    //this.obj.m = document.getElementById("minuteId").innerHTML;
    return this.http.post<string>(this.url, obj);
  }
}
