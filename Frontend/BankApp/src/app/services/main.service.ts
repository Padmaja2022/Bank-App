import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class MainService {

  private baseUrl = 'http://localhost:8080/api/';

  constructor(private httpClient: HttpClient) { }
}
